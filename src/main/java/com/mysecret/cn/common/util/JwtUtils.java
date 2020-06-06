package com.mysecret.cn.common.util;

import com.mysecret.cn.exception.LoginException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import javax.servlet.ServletException;
import java.util.Date;

/**
 * @date 200606
 * @author tianhao
 */
public class JwtUtils {
	/**
	 * 私钥
	 */
	final static String base64EncodedSecretKey = "THHAVEAAPHONE11";

	/**
	 *过期时间,测试使用100分钟
	 */
	public final static long TOKEN_EXP = 1000 * 60 * 100;

	public static String getToken(String userName) {
		/**
		 * 设置基本参数
		 */
		return Jwts.builder().setSubject(userName).claim("roles", "user").setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + TOKEN_EXP))
				.signWith(SignatureAlgorithm.HS256, base64EncodedSecretKey).compact();

	}

	public static Claims checkToken(String token) throws ServletException, LoginException.UnLoginException, LoginException.LoginInvalidException {

		try {

			final Claims claims = Jwts.parser().setSigningKey(base64EncodedSecretKey).parseClaimsJws(token).getBody();
			return claims;

		} catch (ExpiredJwtException e1) {

			throw new LoginException.UnLoginException("Login information expired");

		} catch (Exception e) {

			throw new LoginException.LoginInvalidException("user is not login");

		}

	}

}