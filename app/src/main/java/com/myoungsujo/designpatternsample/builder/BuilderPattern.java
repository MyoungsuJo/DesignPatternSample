package com.myoungsujo.designpatternsample.builder;

/**
 * Created by user4 on 2017-05-18.
 */

public class BuilderPattern {
    private String mStrAccount = "";
    private String mStrMailTitle = "";
    private String mStrMailContents = "";
    private String mStrSenderName = "";

    public static class Builder {
        private String mStrAccount = "";
        private String mStrMailTitle = "";
        private String mStrMailContents = "";
        private String mStrSenderName = "";

        public Builder(final String account) {
            this.mStrAccount = account;
        }

        public Builder(final String account, final String mailTitle) {
            this.mStrAccount = account;
            this.mStrMailTitle = mailTitle;
        }

        public Builder(final String account, final String mailTitle, final String mailContents) {
            this.mStrAccount = account;
            this.mStrMailTitle = mailTitle;
            this.mStrMailContents = mailContents;
        }

        public Builder(final String account, final String mailTitle, final String mailContents, final String mailSenderName) {
            this.mStrAccount = account;
            this.mStrMailTitle = mailTitle;
            this.mStrMailContents = mailContents;
            this.mStrSenderName = mailSenderName;
        }

        public Builder account(final String account) {
            this.mStrAccount = account;
            return this;
        }

        public Builder title(final String title) {
            this.mStrMailTitle = title;
            return this;
        }

        public Builder contents(final String mailContents) {
            this.mStrMailContents = mailContents;
            return this;
        }

        public Builder senderName(final String mailSenderName) {
            this.mStrSenderName = mailSenderName;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }

    public BuilderPattern(Builder builder) {
        mStrAccount = builder.mStrAccount;
        mStrSenderName = builder.mStrSenderName;
        mStrMailTitle = builder.mStrMailTitle;
        mStrMailContents = builder.mStrMailContents;

    }

    public String getAccountName() {
        return mStrAccount;
    }

    public String getSenderName() {
        return mStrSenderName;
    }

    public String getMailTitle() {
        return mStrSenderName;
    }

    public String getMailContents() {
        return mStrMailContents;
    }
}
