package com.iauro.iauroproductassignment.jwt;

import java.lang.System.Logger;
import java.util.Date;

import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.iauro.iauroproductassignment.entities.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;


public class JwtTokenUtil {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenUtil.class);
	
	  private static final long EXPIRE_DURATION = 24 * 60 * 60 * 1000; // 24 hour
	  private static final long EXPIRE_DURATION = 24 * 60 * 60 * 1000; // 24 hour
	     
	    @Value("${app.jwt.secret}")
	    private String SECRET_KEY;
	     
	    public String generateAccessToken(User user) {
	        return Jwts.builder()
	                .setSubject(String.format("%s,%s", user.get_id(), user.getEmail()))
	                .setIssuer("iauro")
	                .setIssuedAt(new Date())
	                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_DURATION))
	                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
	                .compact();
	                 
	        public boolean validateAccessToken(String token) {
	            try {
	                Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token);
	                return true;
	            } catch (ExpiredJwtException ex) {
	                LOGGER.error("JWT expired", ex.getMessage());
	            } catch (IllegalArgumentException ex) {
	                LOGGER.error("Token is null, empty or only whitespace", ex.getMessage());
	            } catch (MalformedJwtException ex) {
	                LOGGER.error("JWT is invalid", ex);
	            } catch (UnsupportedJwtException ex) {
	                LOGGER.error("JWT is not supported", ex);
	            } catch (SignatureException ex) {
	                LOGGER.error("Signature validation failed");
	            }
	             
	            return false;
	        }
	         
	        public String getSubject(String token) {
	            return parseClaims(token).getSubject();
	        }
	         
	        private Claims parseClaims(String token) {
	            return Jwts.parser()
	                    .setSigningKey(SECRET_KEY)
	                    .parseClaimsJws(token)
	                    .getBody();
	        }
	        
	        
	    }

}