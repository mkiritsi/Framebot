/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.msu.cme.rdp.framebot.stat;

/**
 *
 * @author wangqion
 */
public class FrameBotStat {
    String subjectID;
    String queryID;
    int nuclLen;
    int alignLen;
    int identity;
    int score;
    int frameshifts;
    boolean reversed;
    
    public FrameBotStat(String subjectID, String queryID, int nuclLen, int alignLen, int identity, int score, int frameshifts, boolean reversed){
        this.subjectID = subjectID;
        this.queryID = queryID;
        this.nuclLen = nuclLen;
        this.alignLen = alignLen;
        this.identity = identity;
        this.score = score;
        this.frameshifts = frameshifts;
        this.reversed = reversed;
    }
    
    public String getQueryID(){
        return queryID;
    }
    public String getSubjectID(){
        return subjectID;
    }
    public int getNuclLen(){
        return nuclLen;
    }
    public int getAlignLen(){
        return alignLen;
    }
    public int getIdentity(){
        return identity;
    }
    public int getScore(){
        return score;
    }
    public int getFrameshifts(){
        return frameshifts;
    }
    public boolean isReversed(){
        return reversed;
    }
}
