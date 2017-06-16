package com.bignerdranch.android.geoquiz;

/**
 * Created by Apple on 2017/6/16.
 */

public class Question {

    private int mTextResId; //int 用于保存资源ID，资源ID总是INT类型
    private boolean mAnswerTrue;

    public  Question(int textResId, boolean answerTrue){

        mTextResId = textResId;
        mAnswerTrue = answerTrue;

    }

    //生成获取方法与设置方法
    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
