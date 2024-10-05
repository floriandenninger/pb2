package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apjt extends aonm implements aooz {
    public static final apjt a;
    private static volatile aopf i;
    private byte A = 2;
    public int b;
    public apkj c;
    public apjw d;
    public apkc e;
    public atdu f;
    public apju g;
    public apkl h;
    private apko j;
    private apkp k;
    private apkq l;
    private apjz m;
    private apkn n;
    private apjv o;
    private apjs p;
    private avns q;
    private avrg r;
    private apka s;
    private apjr t;
    private atlz u;
    private asli v;
    private askv w;
    private atjf x;
    private apjx y;
    private apkb z;

    static {
        apjt apjtVar = new apjt();
        a = apjtVar;
        aonm.registerDefaultInstance(apjt.class, apjtVar);
    }

    private apjt() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.A);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.A = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0017\u0000\u0001\uedbbᡂ\uf23c飏\u0017\u0000\u0000\u0015\uedbbᡂᐉ\u0004\ue7d2ᡆᐉ\u0003ￆᡇᐉ\u0001\ue5d8ᡈᐉ\u0000\ue5f3ᡉᐉ\u0002\ue14aᲱᐉ\u0007\ue1acṯဉ\b\ue859ἀᐉ\u000fￜ⚌ᐉ\t\ue425⩷ᐉ\n\uf6ea⪗ᐉ\u000bﻠⷡᐉ\r\ue384〠ᐉ\u0010\ue496㴵ᐉ\u0011\uef0d䄖ᐉ\u000eￊ䈕ᐉ\u0012\uead0䫓ᐉ\u0013\uf547偵ᐉ\u0014\uee97八ᐉ\u0015\uf682嗮ᐉ\u0017\ue16b蓉ဉ\u0018\ue16c蓉ᐉ\u0019\uf23c飏ᐉ\u001a", new Object[]{"b", "l", "k", "d", "c", "j", "m", "e", "s", "n", "o", "p", "q", "t", "f", "r", "u", "g", "v", "w", "x", "h", "y", "z"});
            case NEW_MUTABLE_INSTANCE:
                return new apjt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (apjt.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
