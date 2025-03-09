package org.web3j.crypto.transaction.type;

import org.web3j.crypto.Authorization;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author DylanYang
 * @Date 2025/3/9
 */
public class Transaction7702 extends Transaction1559{
    private List<Authorization> authorizationList;
    public Transaction7702(long chainId, BigInteger nonce, BigInteger gasLimit, String to, BigInteger value, String data, BigInteger maxPriorityFeePerGas, BigInteger maxFeePerGas) {
        super(chainId, nonce, gasLimit, to, value, data, maxPriorityFeePerGas, maxFeePerGas);
    }
}
