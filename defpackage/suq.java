package defpackage;

import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import io.grpc.Status;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class suq implements szi {
    final /* synthetic */ sur a;
    private final byte[] b;
    private final byte[] c;
    private final String d;

    public suq(sur surVar, byte[] bArr, aoam aoamVar, String str) {
        byte[] bArr2;
        this.a = surVar;
        this.b = bArr;
        if (aoamVar != null) {
            aoam aoamVar2 = new aoam();
            int i = 0;
            while (true) {
                if (i >= aoamVar.W()) {
                    bArr2 = syc.a;
                    break;
                }
                aoamVar.aA(aoamVar2, i);
                if (aoamVar2.T() == 224886694) {
                    byte[] bArr3 = new byte[aoamVar2.S()];
                    aoamVar2.V().get(bArr3);
                    bArr2 = bArr3;
                    break;
                }
                i++;
            }
        } else {
            bArr2 = syc.a;
        }
        this.c = bArr2;
        this.d = str;
    }

    @Override // defpackage.szi
    public final aoam a(syv syvVar, szh szhVar, sxc sxcVar) {
        int i;
        byte[] bArr;
        int i2;
        suq suqVar;
        try {
            aoam aoamVar = new aoam();
            axoe axoeVar = this.a.c ? new axoe() : null;
            awsn e = ((sxe) this.a.e.get()).b() ? svv.e(sxcVar) : null;
            if (e != null) {
                awst a = awsu.a();
                a.copyOnWrite();
                ((awsu) a.instance).e(e);
                String a2 = sur.a(this.b);
                a.copyOnWrite();
                ((awsu) a.instance).f(a2);
                awsu awsuVar = (awsu) a.build();
                DebuggerClient debuggerClient = (DebuggerClient) this.a.d.get();
                awsv a3 = awsw.a();
                aoqa d = svv.d();
                a3.copyOnWrite();
                ((awsw) a3.instance).p(d);
                a3.copyOnWrite();
                ((awsw) a3.instance).o(awsuVar);
                debuggerClient.sendTimelineEvent(((awsw) a3.build()).toByteArray());
            }
            StringBuilder sb = new StringBuilder();
            ByteBuffer b = sur.b(this.a.b, syvVar);
            UnifiedTemplateResolver unifiedTemplateResolver = (UnifiedTemplateResolver) this.a.a.get();
            byte[] bArr2 = this.b;
            byte[] array = b.array();
            int arrayOffset = b.arrayOffset() + b.position();
            int remaining = b.remaining();
            byte[] bArr3 = this.c;
            String str = this.d;
            try {
                if (bArr2 == null) {
                    throw new IllegalArgumentException("Attempt to resolve a null TemplateConfig");
                }
                byte[][] bArr4 = {null, null, null};
                long[] jArr = axoeVar != null ? new long[1] : null;
                if (array == null) {
                    bArr = UnifiedTemplateResolver.a;
                    i2 = 0;
                    i = 0;
                } else {
                    i = remaining;
                    bArr = array;
                    i2 = arrayOffset;
                }
                try {
                    Status jni_resolveFlat = unifiedTemplateResolver.jni_resolveFlat(bArr2, bArr, i2, i, bArr3, str, unifiedTemplateResolver.b, unifiedTemplateResolver.c, bArr4, jArr);
                    if (jni_resolveFlat.f()) {
                        aoam.aH(ByteBuffer.wrap(bArr4[0]), aoamVar);
                        byte[] bArr5 = bArr4[2];
                        if (bArr5 != null) {
                            String str2 = new String(bArr5);
                            sb.append(str2);
                            if (axoeVar != null) {
                                axoeVar.b = str2;
                            }
                        }
                        if (axoeVar != null) {
                            long j = jArr[0];
                            if (j > 0) {
                                axoeVar.a = j;
                            }
                        }
                    }
                    if (jni_resolveFlat.f()) {
                        StringBuilder sb2 = sxcVar.m;
                        if (sb2 != null) {
                            sb2.append((CharSequence) sb);
                            sb2.append('|');
                        }
                        if (axoeVar != null) {
                            long j2 = axoeVar.a;
                            if (j2 > 0) {
                                szhVar.f(j2);
                            }
                            String str3 = axoeVar.b;
                            if (str3 != null) {
                                szhVar.g(str3);
                            }
                        }
                    }
                    if (e == null || sxcVar.s == null) {
                        suqVar = this;
                    } else {
                        awsr a4 = awss.a();
                        a4.copyOnWrite();
                        ((awss) a4.instance).e(e);
                        awrt j3 = svv.j(aoamVar, null, null, sxcVar.s);
                        if (j3 != null) {
                            a4.copyOnWrite();
                            ((awss) a4.instance).f(j3);
                        }
                        suqVar = this;
                        DebuggerClient debuggerClient2 = (DebuggerClient) suqVar.a.d.get();
                        awsv a5 = awsw.a();
                        aoqa d2 = svv.d();
                        a5.copyOnWrite();
                        ((awsw) a5.instance).p(d2);
                        a5.copyOnWrite();
                        ((awsw) a5.instance).n((awss) a4.build());
                        debuggerClient2.sendTimelineEvent(((awsw) a5.build()).toByteArray());
                    }
                    if (jni_resolveFlat.f()) {
                        return aoamVar;
                    }
                    String valueOf = String.valueOf(jni_resolveFlat.getCode());
                    String a6 = sur.a(suqVar.b);
                    String description = jni_resolveFlat.getDescription();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(a6).length() + String.valueOf(description).length());
                    sb3.append("UnifiedTemplateResolver returned error ");
                    sb3.append(valueOf);
                    sb3.append(", ");
                    sb3.append(a6);
                    sb3.append(": ");
                    sb3.append(description);
                    throw new syf(sb3.toString());
                } catch (IOException e2) {
                    e = e2;
                    throw new syf("Error resolving template with UnifiedTemplateResolver", e);
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (IOException e4) {
            e = e4;
        }
    }
}
