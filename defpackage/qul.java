package defpackage;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qul implements qtw {
    public volatile byte[] a;
    final /* synthetic */ qum b;
    public volatile quo c;
    private final long d;
    private final quq e;

    public qul(qum qumVar, String str, quq quqVar) {
        this.b = qumVar;
        this.e = quqVar;
        this.a = oba.V(str);
        this.d = 0L;
    }

    public qul(qum qumVar, quo quoVar, long j, quq quqVar) {
        this.b = qumVar;
        this.c = quoVar;
        this.d = j;
        this.e = quqVar;
        qumVar.b++;
    }

    @Override // defpackage.qtw
    public final String a(Map map) {
        byte[] V;
        quq clone = this.e.clone();
        clone.c(amlh.SNAPSHOT_START, qur.COARSE);
        if (this.a != null) {
            V = this.a;
        } else {
            qty qtyVar = new qty();
            this.b.e(new quj(this, map, qtyVar));
            try {
                long j = this.d;
                if (!qtyVar.c) {
                    qtyVar.c = true;
                    V = (byte[]) qtyVar.a.poll(j, TimeUnit.MILLISECONDS);
                    if (V == null) {
                        long j2 = this.d;
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Snapshot timeout: ");
                        sb.append(j2);
                        sb.append(" ms");
                        V = oba.V(sb.toString());
                    }
                } else {
                    throw new RuntimeException("BlockingChannel can be read only once.");
                }
            } catch (InterruptedException e) {
                String valueOf = String.valueOf(e.toString());
                V = oba.V(valueOf.length() != 0 ? "Results transfer failed: ".concat(valueOf) : new String("Results transfer failed: "));
            }
        }
        clone.c(amlh.SNAPSHOT_COMPLETE, qur.COARSE);
        if (axtc.b()) {
            aone createBuilder = amlk.a.createBuilder();
            aomf x = aomf.x(V);
            createBuilder.copyOnWrite();
            amlk amlkVar = (amlk) createBuilder.instance;
            amlkVar.b |= 2;
            amlkVar.d = x;
            amlj b = clone.b();
            createBuilder.copyOnWrite();
            amlk amlkVar2 = (amlk) createBuilder.instance;
            b.getClass();
            amlkVar2.e = b;
            amlkVar2.b |= 4;
            amlf amlfVar = amlf.a;
            aone createBuilder2 = amlf.a.createBuilder();
            if (amlfVar.c != axtf.b()) {
                boolean b2 = axtf.b();
                createBuilder2.copyOnWrite();
                amlf amlfVar2 = (amlf) createBuilder2.instance;
                amlfVar2.b |= 1;
                amlfVar2.c = b2;
            }
            amlf amlfVar3 = (amlf) createBuilder2.build();
            createBuilder.copyOnWrite();
            amlk amlkVar3 = (amlk) createBuilder.instance;
            amlfVar3.getClass();
            amlkVar3.f = amlfVar3;
            amlkVar3.b |= 8;
            amlk amlkVar4 = (amlk) createBuilder.build();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8];
                new Random().nextBytes(bArr);
                bArr[0] = 10;
                bArr[1] = 6;
                int i = 3;
                for (int i2 = 0; i2 < 8; i2++) {
                    i ^= bArr[i2];
                }
                bArr[2] = (byte) (((byte) i) ^ bArr[2]);
                byteArrayOutputStream.write(bArr);
                aone builder = amlkVar4.toBuilder();
                builder.copyOnWrite();
                amlk amlkVar5 = (amlk) builder.instance;
                amlkVar5.b &= -2;
                amlkVar5.c = amlk.a.c;
                ((amlk) builder.build()).writeTo(byteArrayOutputStream);
                V = byteArrayOutputStream.toByteArray();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        return Base64.encodeToString(V, 11);
    }

    @Override // defpackage.qtw
    public final void b() {
        this.b.e(new quk(this));
    }
}
