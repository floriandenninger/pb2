package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Pair;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xun {
    public final Set a = amkq.an();
    public aeea b;
    private final Context c;
    private final Executor d;
    private final Executor e;
    private final xup f;
    private final afri g;

    public xun(Context context, Executor executor, Executor executor2, xup xupVar, afri afriVar) {
        this.c = context;
        this.d = executor;
        this.e = executor2;
        this.f = xupVar;
        this.g = afriVar;
    }

    private final void e(Runnable runnable) {
        this.e.execute(runnable);
    }

    public final void a(xum xumVar) {
        if (xumVar != null) {
            this.a.add(xumVar);
        }
    }

    public final void b(xum xumVar) {
        this.a.remove(xumVar);
    }

    public final void c(final String str, final String str2, final Uri uri) {
        this.d.execute(new Runnable() { // from class: xul
            @Override // java.lang.Runnable
            public final void run() {
                xun.this.d(str, str2, uri);
            }
        });
    }

    public final void d(String str, String str2, Uri uri) {
        try {
            byte[] c = anbt.c(this.c.getContentResolver().openInputStream(uri));
            final Drawable drawable = (Drawable) this.g.b(c);
            final int length = c.length;
            e(new Runnable() { // from class: xuj
                @Override // java.lang.Runnable
                public final void run() {
                    xun xunVar = xun.this;
                    Drawable drawable2 = drawable;
                    int i = length;
                    Iterator it = xunVar.a.iterator();
                    while (it.hasNext()) {
                        ((xum) it.next()).c(drawable2, i);
                    }
                }
            });
            xup xupVar = this.f;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
            yjk.e();
            if (xupVar.c.t()) {
                axac axacVar = new axac(new BufferedInputStream(byteArrayInputStream));
                awzx awzxVar = new awzx();
                awzxVar.e("X-YouTube-ChannelId", str2);
                afsx c2 = xupVar.c.c();
                if (!(c2 instanceof AccountIdentity)) {
                    throw new xuo("AccountIdentity is required");
                }
                aftg d = xupVar.b.d((AccountIdentity) c2);
                if (!d.g()) {
                    throw new xuo("Could not fetch auth token");
                }
                Pair b = d.b();
                awzxVar.e((String) b.first, (String) b.second);
                axam a = xupVar.e.a(str, awzxVar, axacVar, null, xupVar.d);
                try {
                    try {
                        axap axapVar = (axap) a.a().get();
                        if (axapVar.b()) {
                            throw new cng(axapVar.a);
                        }
                        if (!axapVar.a()) {
                            throw new cng();
                        }
                        awzy awzyVar = axapVar.b;
                        int i = awzyVar.a;
                        if (i >= 0) {
                            awzx awzxVar2 = awzyVar.b;
                            awzxVar2.getClass();
                            try {
                                InputStream inputStream = awzyVar.c;
                                if (inputStream != null) {
                                    byte[] c3 = anbt.c(inputStream);
                                    if (i != 200) {
                                        throw new cno(xup.a(i, awzxVar2, c3));
                                    }
                                    try {
                                        final String string = new JSONObject(new String(c3, xup.a)).getString("encryptedBlobId");
                                        e(new Runnable() { // from class: xuk
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                xun xunVar = xun.this;
                                                String str3 = string;
                                                Iterator it = xunVar.a.iterator();
                                                while (it.hasNext()) {
                                                    ((xum) it.next()).b(str3);
                                                }
                                            }
                                        });
                                        return;
                                    } catch (JSONException unused) {
                                        throw new cnj(xup.a(200, awzxVar2, c3));
                                    }
                                }
                                throw new cng();
                            } catch (IOException unused2) {
                                throw new cng();
                            }
                        }
                        throw new cng();
                    } catch (InterruptedException e) {
                        a.f();
                        throw e;
                    } catch (ExecutionException e2) {
                        if (e2.getCause() != null) {
                            throw new cng(e2.getCause());
                        }
                        throw new cng();
                    }
                } catch (cng e3) {
                    e = e3;
                    throw new xuo(e);
                } catch (cnj e4) {
                    e = e4;
                    throw new xuo(e);
                } catch (cno e5) {
                    e = e5;
                    throw new xuo(e);
                }
            }
            throw new xuo("Must be signed in to upload");
        } catch (Exception unused3) {
            this.b = new aeea(str, str2, uri);
            e(new Runnable() { // from class: xui
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it = xun.this.a.iterator();
                    while (it.hasNext()) {
                        ((xum) it.next()).a();
                    }
                }
            });
        }
    }
}
