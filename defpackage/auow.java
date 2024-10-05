package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auow extends aonm implements aooz {
    public static final auow a;
    private static volatile aopf j;
    public int b;
    public apsj c;
    public auod d;
    public auwh e;
    public asnr f;
    public apqv g;
    public aunk h;
    public aqrf i;
    private byte k = 2;

    static {
        auow auowVar = new auow();
        a = auowVar;
        aonm.registerDefaultInstance(auow.class, auowVar);
    }

    private auow() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001ﶝ\u171d\uf492䤳\u0007\u0000\u0000\u0007ﶝ\u171dᐉ\u0004\ue7a7ᦌᐉ\u0000龜ℶᐉ\u0001\ue952⒡ᐉ\u0002\ueda0⣽ᐉ\u0003\ue8b0㻿ᐉ\u0005\uf492䤳ᐉ\u0006", new Object[]{"b", "g", "c", "d", "e", "f", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new auow();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (auow.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
