package com.goldmansachs.assignment.demo.web.model;


import java.io.Serializable;

public class StringDto implements Serializable {
    private String input;
    private String result;

    public StringDto(String input, String result) {
        this.input = input;
        this.result = result;
    }

    public StringDto() {
    }

    public static StringDtoBuilder builder() {
        return new StringDtoBuilder();
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof StringDto)) return false;
        final StringDto other = (StringDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$input = this.getInput();
        final Object other$input = other.getInput();
        if (this$input == null ? other$input != null : !this$input.equals(other$input)) return false;
        final Object this$result = this.getResult();
        final Object other$result = other.getResult();
        if (this$result == null ? other$result != null : !this$result.equals(other$result)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof StringDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $input = this.getInput();
        result = result * PRIME + ($input == null ? 43 : $input.hashCode());
        final Object $result = this.getResult();
        result = result * PRIME + ($result == null ? 43 : $result.hashCode());
        return result;
    }

    public String toString() {
        return "StringDto(input=" + this.getInput() + ", result=" + this.getResult() + ")";
    }

    public static class StringDtoBuilder {
        private String input;
        private String result;

        StringDtoBuilder() {
        }

        public StringDtoBuilder input(String input) {
            this.input = input;
            return this;
        }

        public StringDtoBuilder result(String result) {
            this.result = result;
            return this;
        }

        public StringDto build() {
            return new StringDto(input, result);
        }

        public String toString() {
            return "StringDto.StringDtoBuilder(input=" + this.input + ", result=" + this.result + ")";
        }
    }
}
