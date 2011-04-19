package net.paoding.rose.web.impl.mapping.ignored;

import net.paoding.rose.web.RequestPath;

import java.util.regex.Pattern;

public class IgnoredPathRegexMatch implements IgnoredPath {

    private Pattern path;

    public IgnoredPathRegexMatch(String path) {
        this.path = Pattern.compile(path);
    }

    @Override
    public boolean hit(RequestPath requestPath) {
        return path.matcher(requestPath.getRosePath()).matches();
    }
}
