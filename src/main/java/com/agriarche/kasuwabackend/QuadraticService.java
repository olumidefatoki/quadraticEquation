package com.agriarche.kasuwabackend;

import org.springframework.stereotype.Service;

@Service
public class QuadraticService {

    public QuadraticAnswer solve(QuadraticRequest request){
        QuadraticAnswer answer = new QuadraticAnswer();
         //(-b+((b^2)-4ac))sqrt/2a

        double var1 = -request.getB();
        double var2 = Math.pow(request.getB(),2) - (4 * request.getA() * request.getC());
        if (var2 < 0){
            throw new  IllegalArgumentException("cann not find square root ot number less than zero ");

        }
        double var3 = Math.sqrt(var2);
        double var4 = var1 + var3;
        double var5 = var1 - var3;
        answer.setFirstAnswer(var4/(2*request.getA()));
        answer.setSecondAnswer(var5/(2*request.getA()));

        return answer;
    }

}
