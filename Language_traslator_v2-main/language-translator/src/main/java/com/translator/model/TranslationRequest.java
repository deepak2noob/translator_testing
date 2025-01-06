package com.translator.model;

import jakarta.validation.constraints.NotBlank;

public class TranslationRequest {
    @NotBlank(message = "Text to translate cannot be empty")
    private String text;

    @NotBlank(message = "Source language cannot be empty")
    private String fromLang;

    @NotBlank(message = "Target language cannot be empty")
    private String toLang;

    // Getters and Setters
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    
    public String getFromLang() { return fromLang; }
    public void setFromLang(String fromLang) { this.fromLang = fromLang; }
    
    public String getToLang() { return toLang; }
    public void setToLang(String toLang) { this.toLang = toLang; }
}