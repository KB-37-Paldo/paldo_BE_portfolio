package com.example.portfolioservice.service;

import com.example.portfolioservice.model.HoldingsResponseDto;

public interface AssetService {
    // ์์ฐ์กฐํ
    HoldingsResponseDto getAsset(long userId);

}
