package org.jboss.maven.plugins.bombuilder;

/**
 * @author <a href="mailto:kabir.khan@jboss.com">Kabir Khan</a>
 */
public class DependencyId {
    private final String groupId;
    private final String artifactId;
    private final String type;

    public DependencyId(String groupId, String artifactId, String type) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.type = type;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DependencyId that = (DependencyId) o;

        if (!groupId.equals(that.groupId)) return false;
        if (!artifactId.equals(that.artifactId)) return false;
        return type.equals(that.type);
    }

    @Override
    public int hashCode() {
        int result = groupId.hashCode();
        result = 31 * result + artifactId.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }
}
