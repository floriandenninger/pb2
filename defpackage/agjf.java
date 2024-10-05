package defpackage;

import java.security.Key;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agjf {
    static final String[] a = {"video_id", "itag", "format_stream_proto", "duration_millis", "audio_only", "bytes_transferred", "bytes_total", "stream_status", "stream_status_timestamp", "transfer_added_timestamp", "transfer_started_timestamp", "transfer_completed_timestamp", "storage_format", "wrapped_key", "disco_key_iv", "disco_key", "disco_nonce_text", "encryption_key_type", "external_yt_file_path", "storage_id", "expired_stream", "ytb_uri"};
    public final Key b;
    public final agik c;
    public final agis d;
    private final List e = new ArrayList();

    public agjf(Key key, agik agikVar, agis agisVar) {
        this.b = key;
        this.c = agikVar;
        this.d = agisVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.ContentValues a(defpackage.agnm r8) {
        /*
            r7 = this;
            android.net.Uri r0 = r8.n
            java.lang.String r1 = r8.j
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r3 = r8.g()
            java.lang.String r4 = "video_id"
            r2.put(r4, r3)
            int r3 = r8.a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "itag"
            r2.put(r4, r3)
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel r3 = r8.b
            aqxz r3 = r3.a
            byte[] r3 = r3.toByteArray()
            java.lang.String r4 = "format_stream_proto"
            r2.put(r4, r3)
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel r3 = r8.b
            long r3 = r3.c
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "duration_millis"
            r2.put(r4, r3)
            boolean r3 = r8.c
            java.lang.Integer r3 = defpackage.yoj.b(r3)
            java.lang.String r4 = "audio_only"
            r2.put(r4, r3)
            long r3 = r8.b()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "bytes_total"
            r2.put(r4, r3)
            long r3 = r8.d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "bytes_transferred"
            r2.put(r4, r3)
            int r3 = r8.e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "stream_status"
            r2.put(r4, r3)
            long r3 = r8.f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "stream_status_timestamp"
            r2.put(r4, r3)
            int r3 = r8.o
            int r4 = r3 + (-1)
            r5 = 0
            if (r3 == 0) goto Le6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "storage_format"
            r2.put(r4, r3)
            byte[] r3 = r8.g
            java.lang.String r4 = "wrapped_key"
            r2.put(r4, r3)
            byte[] r3 = r8.h
            java.lang.String r4 = "disco_key_iv"
            r2.put(r4, r3)
            awyz r3 = r8.i
            byte[] r4 = r8.h
            if (r3 == 0) goto La7
            if (r4 != 0) goto L99
            goto La7
        L99:
            byte[] r3 = r3.toByteArray()
            int r6 = r3.length
            if (r6 <= 0) goto La7
            java.security.Key r6 = r7.b
            byte[] r3 = defpackage.ajkn.g(r4, r3, r6)
            goto La8
        La7:
            r3 = r5
        La8:
            java.lang.String r4 = "disco_key"
            r2.put(r4, r3)
            if (r1 != 0) goto Lb1
            r1 = r5
            goto Lb7
        Lb1:
            java.nio.charset.Charset r3 = defpackage.amme.c
            byte[] r1 = r1.getBytes(r3)
        Lb7:
            java.lang.String r3 = "disco_nonce_text"
            r2.put(r3, r1)
            int r1 = r8.k
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "encryption_key_type"
            r2.put(r3, r1)
            if (r0 != 0) goto Lca
            goto Lce
        Lca:
            java.lang.String r5 = r0.toString()
        Lce:
            java.lang.String r0 = "ytb_uri"
            r2.put(r0, r5)
            java.lang.String r0 = r8.l
            java.lang.String r1 = "storage_id"
            r2.put(r1, r0)
            boolean r8 = r8.m
            java.lang.Integer r8 = defpackage.yoj.b(r8)
            java.lang.String r0 = "expired_stream"
            r2.put(r0, r8)
            return r2
        Le6:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agjf.a(agnm):android.content.ContentValues");
    }

    public final void b(agje agjeVar) {
        this.e.add(agjeVar);
    }

    public final void c(String str, boolean z) {
        try {
            this.c.a().delete("streams", "video_id = ?", new String[]{str});
            agis agisVar = this.d;
            try {
                agisVar.b.a().delete("hashes", "video_id = ?", new String[]{str});
            } finally {
                Iterator it = agisVar.c.iterator();
                while (it.hasNext()) {
                    ((agir) it.next()).a();
                }
            }
        } finally {
            Iterator it2 = this.e.iterator();
            while (it2.hasNext()) {
                ((agje) it2.next()).a(str, z);
            }
        }
    }
}
