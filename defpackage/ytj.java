package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ytj extends RequestFinishedInfo.Listener {
    public String a;
    private final ysb b;

    public ytj(ysb ysbVar, Executor executor) {
        super(executor);
        this.b = ysbVar;
    }

    public static ysa a(RequestFinishedInfo requestFinishedInfo, String str) {
        babu babuVar;
        Integer num;
        List list;
        yrz yrzVar = new yrz();
        String url = requestFinishedInfo.getUrl();
        if (url != null) {
            yrzVar.a = url;
            if (str != null) {
                yrzVar.o = str;
            }
            UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
            if (responseInfo != null) {
                yrzVar.h = Integer.valueOf(responseInfo.getHttpStatusCode());
                yrzVar.i = responseInfo.getNegotiatedProtocol();
                Map allHeaders = responseInfo.getAllHeaders();
                if (allHeaders != null && (list = (List) allHeaders.get("Content-Type")) != null && !list.isEmpty()) {
                    yrzVar.b = (String) list.get(0);
                }
            }
            RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
            if (metrics != null) {
                yrzVar.c = metrics.getReceivedByteCount();
                yrzVar.d = metrics.getSentByteCount();
                yrzVar.e = metrics.getRequestStart() == null ? null : Long.valueOf(metrics.getRequestStart().getTime());
                yrzVar.f = metrics.getTtfbMs();
                yrzVar.g = metrics.getTotalTimeMs();
            }
            int finishedReason = requestFinishedInfo.getFinishedReason();
            int i = 2;
            if (finishedReason == 0) {
                babuVar = babu.SUCCEEDED;
            } else if (finishedReason == 1) {
                babuVar = babu.FAILED;
            } else if (finishedReason == 2) {
                babuVar = babu.CANCELED;
            } else {
                babuVar = babu.REQUEST_STATUS_UNSPECIFIED;
            }
            yrzVar.j = Integer.valueOf(babuVar.e);
            if (requestFinishedInfo.getException() != null) {
                yrzVar.n = requestFinishedInfo.getException();
                CronetException exception = requestFinishedInfo.getException();
                if (!(exception instanceof CallbackException)) {
                    if (exception instanceof NetworkException) {
                        switch (((NetworkException) exception).getErrorCode()) {
                            case 1:
                                i = 3;
                                break;
                            case 2:
                                i = 4;
                                break;
                            case 3:
                                i = 5;
                                break;
                            case 4:
                                i = 6;
                                break;
                            case 5:
                                i = 7;
                                break;
                            case 6:
                                i = 8;
                                break;
                            case 7:
                                i = 9;
                                break;
                            case 8:
                                i = 10;
                                break;
                            case 9:
                                i = 11;
                                break;
                            case 10:
                                i = 12;
                                break;
                            case 11:
                                i = 13;
                                break;
                        }
                    }
                    i = 1;
                }
                yrzVar.k = Integer.valueOf(i - 1);
                if (requestFinishedInfo.getException() instanceof QuicException) {
                    yrzVar.l = Integer.valueOf(((QuicException) requestFinishedInfo.getException()).getQuicDetailedErrorCode());
                }
            }
            if (requestFinishedInfo.getAnnotations() != null) {
                Collection annotations = requestFinishedInfo.getAnnotations();
                ArrayList arrayList = new ArrayList();
                for (Object obj : annotations) {
                    if (obj instanceof yti) {
                        Collection collection = ((yti) obj).a;
                        if (collection != null) {
                            arrayList.addAll(collection);
                        }
                    } else {
                        arrayList.add(obj);
                    }
                }
                yrzVar.m = arrayList;
            }
            String str2 = yrzVar.a;
            if (str2 == null || (num = yrzVar.j) == null) {
                StringBuilder sb = new StringBuilder();
                if (yrzVar.a == null) {
                    sb.append(" url");
                }
                if (yrzVar.j == null) {
                    sb.append(" requestStatus");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            return new ysa(str2, yrzVar.b, yrzVar.c, yrzVar.d, yrzVar.e, yrzVar.f, yrzVar.g, yrzVar.h, yrzVar.i, num.intValue(), yrzVar.k, yrzVar.l, yrzVar.m, yrzVar.n, yrzVar.o);
        }
        throw new NullPointerException("Null url");
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        this.b.a(a(requestFinishedInfo, this.a));
    }
}
