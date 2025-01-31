package dev.beejh02.demo;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JasyptTest {

    @Test
    public void jasypt() {
        String value = "jdbc:mariadb://127.0.0.1:3307/testdb";
        String result = jasyptEncoding(value);
        log.debug("---{}---", result);
        System.out.println("result :" + result);
    }



    public String jasyptEncoding(String value) {
        String key = "5^zx62]B6n:$S2b/N#3xjkRC0=k#z:qj";
        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWITHMD5ANDDES");
        pbeEnc.setPassword(key);
        return pbeEnc.encrypt(value);
    }
}
