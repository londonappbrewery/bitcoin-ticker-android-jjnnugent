package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {

  private double mResult;

  public static BitcoinDataModel fromJson(JSONObject jsonObject) {

    try {

      BitcoinDataModel bitcoinData = new BitcoinDataModel();
      bitcoinData.mResult = jsonObject.getDouble("last");
      return bitcoinData;

    } catch (JSONException e) {

      e.printStackTrace();
      return null;

    }
  }

  public double getResult() {
    return mResult;
  }

}
