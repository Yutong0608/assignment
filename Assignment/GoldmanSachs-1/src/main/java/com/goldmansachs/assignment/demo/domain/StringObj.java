package com.goldmansachs.assignment.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class StringObj {
    @Id
    private String input;

    @Column
    private String result;

    public StringObj(String input, String result) {
        this.input = input;
        this.result = result;
    }

    public StringObj() {
    }

    public static StringObjBuilder builder() {
        return new StringObjBuilder();
    }

    public String getInput() {
        return this.input;
    }

    public String getResult() {
        return this.result;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public static class StringObjBuilder {
        private String input;
        private String result;

        StringObjBuilder() {
        }

        public StringObjBuilder input(String input) {
            this.input = input;
            return this;
        }

        public StringObjBuilder result(String result) {
            this.result = result;
            return this;
        }

        public StringObj build() {
            return new StringObj(input, result);
        }

        public String toString() {
            return "StringObj.StringObjBuilder(input=" + this.input + ", result=" + this.result + ")";
        }
    }
}
