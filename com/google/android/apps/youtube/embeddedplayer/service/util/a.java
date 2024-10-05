package com.google.android.apps.youtube.embeddedplayer.service.util;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import defpackage.amkq;
import defpackage.amru;
import defpackage.amvj;
import j$.util.Optional;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a {
    private static final amru a = amru.u("youtube.com", "www.youtube.com", "m.youtube.com", "youtu.be");
    private static final amru b = amru.s("start", "t");

    public static Optional a(String str) {
        Optional empty;
        Optional f;
        if (TextUtils.isEmpty(str)) {
            empty = Optional.empty();
        } else {
            Uri parse = Uri.parse(str);
            if (!parse.isAbsolute()) {
                parse = Uri.fromParts("https", str, null);
            }
            String host = parse.getHost();
            if (host == null || !a.contains(amkq.c(host))) {
                empty = Optional.empty();
            } else {
                List<String> pathSegments = parse.getPathSegments();
                if (pathSegments == null || pathSegments.size() <= 0 || pathSegments.size() > 2) {
                    empty = Optional.empty();
                } else {
                    empty = Optional.of(parse);
                }
            }
        }
        if (!empty.isPresent()) {
            return Optional.empty();
        }
        Uri uri = (Uri) empty.get();
        if (!"youtu.be".equals(uri.getHost())) {
            if (!"embed".equals(uri.getPathSegments().get(0))) {
                f = Optional.empty();
            } else {
                String queryParameter = uri.getQueryParameter("playlist");
                f = SimplePlaybackDescriptor.f((String) f(uri).orElse(null), queryParameter != null ? Arrays.asList(queryParameter.split(",")) : null, uri.getQueryParameter("list"), b(uri), d(uri), e(uri));
            }
            if (f.isPresent()) {
                return f;
            }
            List<String> pathSegments2 = uri.getPathSegments();
            if (pathSegments2.size() <= 0) {
                return Optional.empty();
            }
            if (!"watch".equals(pathSegments2.get(0))) {
                return Optional.empty();
            }
            return SimplePlaybackDescriptor.f((String) f(uri).orElse(null), null, uri.getQueryParameter("list"), b(uri), d(uri), e(uri));
        }
        List<String> pathSegments3 = uri.getPathSegments();
        if (pathSegments3.size() != 1) {
            return Optional.empty();
        }
        return SimplePlaybackDescriptor.f(pathSegments3.get(0), null, null, b(uri), 0, e(uri));
    }

    private static int b(Uri uri) {
        return c(uri, "autoplay") != 1 ? 0 : 1;
    }

    private static int c(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (Exception unused) {
            return 0;
        }
    }

    private static int d(Uri uri) {
        return c(uri, "index");
    }

    private static int e(Uri uri) {
        amru amruVar = b;
        int i = ((amvj) amruVar).c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            i3 = c(uri, (String) amruVar.get(i2));
            i2++;
            if (i3 != 0) {
                break;
            }
        }
        return (int) TimeUnit.SECONDS.toMillis(i3);
    }

    private static Optional f(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.size() >= 2 ? pathSegments.get(1) : null;
        if (TextUtils.isEmpty(str)) {
            str = uri.getQueryParameter("v");
        }
        return Optional.ofNullable(str);
    }
}
