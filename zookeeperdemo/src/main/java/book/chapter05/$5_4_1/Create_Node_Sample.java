package book.chapter05.$5_4_1;
import org.I0Itec.zkclient.ZkClient;

import com.newland.zookeeperdemo.ZooKeeperConfig;

// 使用ZkClient创建节点
public class Create_Node_Sample {

    public static void main(String[] args) throws Exception {
    	ZkClient zkClient = new ZkClient(ZooKeeperConfig.HOST, 15000);
        String path = "/zk-book/c1";
        zkClient.createPersistent(path, true);
    }
}