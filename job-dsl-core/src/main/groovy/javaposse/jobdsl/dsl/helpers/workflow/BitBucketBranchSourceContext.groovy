package javaposse.jobdsl.dsl.helpers.workflow

import javaposse.jobdsl.dsl.AbstractContext
import javaposse.jobdsl.dsl.JobManagement

class BitBucketBranchSourceContext extends AbstractContext {
    String apiUri
    String scanCredentialsId
    String checkoutCredentialsId = 'SAME'
    String repoOwner
    String repository
    String includes = '*'
    String excludes

    BitBucketBranchSourceContext(JobManagement jobManagement) {
        super(jobManagement)
    }

    /**
     * Sets the BitBucket API URI. Defaults to BitBucket.
     */
    void apiUri(String apiUri) {
        this.apiUri = apiUri
    }

    /**
     * Sets scan credentials for authentication with BitBucket.
     */
    void scanCredentialsId(String scanCredentialsId) {
        this.scanCredentialsId = scanCredentialsId
    }

    /**
     * Sets checkout credentials for authentication with BitBucket. Defaults to the scan credentials.
     */
    void checkoutCredentialsId(String checkoutCredentialsId) {
        this.checkoutCredentialsId = checkoutCredentialsId
    }

    /**
     * Sets the name of the BitBucket Organization or BitBucket User Account.
     */
    void repoOwner(String repoOwner) {
        this.repoOwner = repoOwner
    }

    /**
     * Sets the name of the BitBucket repository.
     */
    void repository(String repository) {
        this.repository = repository
    }

    /**
     * Sets a pattern for branches to include.
     */
    void includes(String includes) {
        this.includes = includes
    }

    /**
     * Sets a pattern for branches to exclude.
     */
    void excludes(String excludes) {
        this.excludes = excludes
    }
}
