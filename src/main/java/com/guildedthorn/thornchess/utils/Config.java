package com.guildedthorn.thornchess.utils;

public class Config {
    public Bot bot;
    public Elixir elixir;
    
    public static class Bot {
        public String token = "";
    }
    
    public static class Elixir {
        public String key = "";
        public String endpoint = "";
    }
    
}
