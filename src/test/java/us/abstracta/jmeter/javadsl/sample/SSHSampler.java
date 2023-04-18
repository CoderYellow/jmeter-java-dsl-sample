package us.abstracta.jmeter.javadsl.sample;

import org.apache.jmeter.testelement.TestElement;
import us.abstracta.jmeter.javadsl.core.samplers.BaseSampler;

import static us.abstracta.jmeter.javadsl.sample.SSHSFTPSampler.SFTP_COMMAND_PUT;

public class SSHSampler extends BaseSampler<SSHSampler> {

    protected SSHSampler(String name, Class guiClass) {
        super(name, guiClass);
    }

    @Override
    protected TestElement buildTestElement() {
        SSHSFTPSampler sftpSampler = new SSHSFTPSampler();
        sftpSampler.setHostname("192.168.50.237");
        sftpSampler.setUsername("knode1");
//        sftpSampler.setSshkeyfile("/home/coder/.ssh/id_rsa");
        sftpSampler.setPassword("19890604");
        sftpSampler.setAction(SFTP_COMMAND_PUT);
        sftpSampler.setSource("/data/Git/jmeter-java-dsl-sample/pom.xml");
        sftpSampler.setDestination("./");
        return sftpSampler;
    }
}
