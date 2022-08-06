package lisbom.solidifly.solidifly;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.1.
 */
@SuppressWarnings("rawtypes")
public class Human extends Contract {
    public static final String BINARY = "60c06040526004608090815263082d8caf60e31b60a05260009061002390826100da565b50601060015534801561003557600080fd5b50610199565b634e487b7160e01b600052604160045260246000fd5b600181811c9082168061006557607f821691505b60208210810361008557634e487b7160e01b600052602260045260246000fd5b50919050565b601f8211156100d557600081815260208120601f850160051c810160208610156100b25750805b601f850160051c820191505b818110156100d1578281556001016100be565b5050505b505050565b81516001600160401b038111156100f3576100f361003b565b610107816101018454610051565b8461008b565b602080601f83116001811461013c57600084156101245750858301515b600019600386901b1c1916600185901b1785556100d1565b600085815260208120601f198616915b8281101561016b5788860151825594840194600190910190840161014c565b50858210156101895787850151600019600388901b60f8161c191681555b5050505050600190811b01905550565b6103fe806101a86000396000f3fe608060405234801561001057600080fd5b506004361061004c5760003560e01c806317d7de7c14610051578063967e6e651461006f578063c47f002714610080578063d5dcf12714610095575b600080fd5b6100596100a8565b604051610066919061014a565b60405180910390f35b600154604051908152602001610066565b61009361008e3660046101b5565b61013a565b005b6100936100a3366004610266565b600155565b6060600080546100b79061027f565b80601f01602080910402602001604051908101604052809291908181526020018280546100e39061027f565b80156101305780601f1061010557610100808354040283529160200191610130565b820191906000526020600020905b81548152906001019060200180831161011357829003601f168201915b5050505050905090565b60006101468282610308565b5050565b600060208083528351808285015260005b818110156101775785810183015185820160400152820161015b565b81811115610189576000604083870101525b50601f01601f1916929092016040019392505050565b634e487b7160e01b600052604160045260246000fd5b6000602082840312156101c757600080fd5b813567ffffffffffffffff808211156101df57600080fd5b818401915084601f8301126101f357600080fd5b8135818111156102055761020561019f565b604051601f8201601f19908116603f0116810190838211818310171561022d5761022d61019f565b8160405282815287602084870101111561024657600080fd5b826020860160208301376000928101602001929092525095945050505050565b60006020828403121561027857600080fd5b5035919050565b600181811c9082168061029357607f821691505b6020821081036102b357634e487b7160e01b600052602260045260246000fd5b50919050565b601f82111561030357600081815260208120601f850160051c810160208610156102e05750805b601f850160051c820191505b818110156102ff578281556001016102ec565b5050505b505050565b815167ffffffffffffffff8111156103225761032261019f565b61033681610330845461027f565b846102b9565b602080601f83116001811461036b57600084156103535750858301515b600019600386901b1c1916600185901b1785556102ff565b600085815260208120601f198616915b8281101561039a5788860151825594840194600190910190840161037b565b50858210156103b85787850151600019600388901b60f8161c191681555b5050505050600190811b0190555056fea26469706673582212202507903ebbd687640ac0b2bf4af5fe3ccbe1c13f9c55df1959ac2071da45c6cf64736f6c634300080f0033";

    public static final String FUNC_GETAGE = "getAge";

    public static final String FUNC_GETNAME = "getName";

    public static final String FUNC_SETAGE = "setAge";

    public static final String FUNC_SETNAME = "setName";

    @Deprecated
    protected Human(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Human(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Human(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Human(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }




    public RemoteFunctionCall<BigInteger> getAge() {
        final Function function = new Function(FUNC_GETAGE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> getName() {
        final Function function = new Function(FUNC_GETNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setAge(BigInteger newAge) {
        final Function function = new Function(
                FUNC_SETAGE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(newAge)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setName(String newName) {
        final Function function = new Function(
                FUNC_SETNAME, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(newName)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Human load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Human(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Human load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Human(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Human load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Human(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Human load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Human(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Human> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Human.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Human> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Human.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Human> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Human.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Human> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Human.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
