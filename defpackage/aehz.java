package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aehz implements aefu {
    public final aty a;
    public final ath b;
    public final ByteBuffer c;
    public final int d;
    public final aefv e;
    public boolean f;
    public final boolean i;
    private ovx l;
    private ByteBuffer m;
    private Integer n;
    private final boolean o;
    private final aevb p;
    private final Set j = new HashSet();
    private final ArrayDeque k = new ArrayDeque();
    public long g = 0;
    public int h = -1;

    public aehz(aty atyVar, ath athVar, ByteBuffer byteBuffer, afhs afhsVar) {
        this.a = atyVar;
        this.b = athVar;
        this.c = byteBuffer;
        this.i = afhsVar.o().D;
        this.d = afhsVar.o().F;
        this.o = afhsVar.p().X;
        Object obj = athVar.k;
        this.p = obj instanceof aehx ? ((aehx) obj).f : null;
        this.e = new aefv(this);
    }

    @Override // defpackage.aefu
    public final void a(int i, int i2, ByteBuffer byteBuffer) {
        aevb aevbVar;
        if (this.l == null) {
            ovx a = ovx.a(i);
            this.l = a;
            if (a == null) {
                return;
            }
            if (this.p == null && a != ovx.MEDIA && this.l != ovx.MEDIA_HEADER) {
                this.l = null;
                return;
            } else if (byteBuffer.remaining() == 0) {
                this.l = null;
                return;
            } else if (this.l == ovx.MEDIA) {
                this.m = ByteBuffer.allocate(aedn.a(byteBuffer.get(byteBuffer.position())));
            } else {
                this.m = ByteBuffer.allocate(byteBuffer.remaining() + i2);
            }
        }
        ByteBuffer byteBuffer2 = this.m;
        if (byteBuffer != null && byteBuffer2 != null) {
            int limit = byteBuffer.limit();
            byteBuffer2.put(byteBuffer);
        }
        if (this.l == ovx.MEDIA) {
            if (this.n == null) {
                afki.a(this.m);
                if (this.m.remaining() == 0) {
                    this.n = aedn.b(this.m);
                }
            }
            Integer num = this.n;
            if (num != null) {
                if (this.j.contains(num)) {
                    this.k.addLast(byteBuffer);
                } else if (this.i) {
                    this.h = 2;
                    return;
                }
            }
        }
        if (i2 == 0) {
            if (this.l != ovx.MEDIA) {
                ovx ovxVar = this.l;
                ByteBuffer byteBuffer3 = this.m;
                afki.a(ovxVar);
                afki.d(ovxVar != ovx.MEDIA);
                afki.a(byteBuffer3);
                int ordinal = ovxVar.ordinal();
                if (ordinal != 4) {
                    try {
                        if (ordinal == 12) {
                            aevb aevbVar2 = this.p;
                            if (aevbVar2 != null) {
                                aevbVar2.a.a.l((atmw) ((aone) atmw.a.createBuilder().mergeFrom(byteBuffer3.array(), aomw.b())).build());
                            }
                        } else if (ordinal == 13 && (aevbVar = this.p) != null) {
                            ovi oviVar = (ovi) ((aone) ovi.a.createBuilder().mergeFrom(byteBuffer3.array(), aomw.b())).build();
                            if ((oviVar.b & 1) != 0) {
                                aevbVar.a.b.h.b(oviVar.d, new HashSet(oviVar.c));
                            }
                        }
                    } catch (aoob unused) {
                        this.h = 5;
                    }
                } else {
                    try {
                        ovo ovoVar = (ovo) ((aone) ovo.a.createBuilder().mergeFrom(byteBuffer3.array(), aomw.b())).build();
                        if (ovoVar != null && (ovoVar.b & 1) != 0) {
                            this.j.add(Integer.valueOf(ovoVar.c));
                        }
                    } catch (aoob unused2) {
                        this.h = 1;
                    }
                }
            }
            this.l = null;
            this.m = null;
            this.n = null;
        }
    }

    public final int b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (!this.k.isEmpty()) {
            ByteBuffer byteBuffer = (ByteBuffer) this.k.peek();
            int remaining = byteBuffer.remaining();
            int i4 = i3 + remaining;
            if (i4 <= i2) {
                ((ByteBuffer) this.k.remove()).get(bArr, i3 + i, remaining);
                i3 = i4;
            } else {
                byteBuffer.get(bArr, i + i3, i2 - i3);
                return i2;
            }
        }
        return i3;
    }

    public final void c() {
        if (this.o && this.g == 0) {
            throw new aehy(6, this.b);
        }
    }
}
