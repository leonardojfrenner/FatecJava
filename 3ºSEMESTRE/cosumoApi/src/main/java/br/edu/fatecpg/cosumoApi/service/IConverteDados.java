package br.edu.fatecpg.cosumoApi.service;



public interface IConverteDados {
    public <T> T converteDados(String json, Class<T> tClass);
}