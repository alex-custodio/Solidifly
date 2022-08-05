package lisbom.solidifly.solidifly;

import java.math.BigDecimal;

public class Transaction {
    public Transaction() throws Exception {
        Web3j web3j = Web3j.build(new HttpService("http://127.0.0.1:7545"));
        TransactionManager transactionManager = new RawTransactionManager(web3j, getCredentialsFromPrivateKey());
        Transfer transfer = new Transfer(web3j, transactionManager);
        TransactionReceipt transactionReceipt = transfer.sendFunds(RECIPIENT, BigDecimal.TEN, Convert.Unit.ETHER, GAS_PRICE, GAS_LIMIT).send();
        String contractAddress = Human.deploy(web3j,getCredentialsFromPrivateKey(), contractGasProvider).send().getContractAddress();
        System.out.print(contractAddress);
    }
}
