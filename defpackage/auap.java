package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auap extends aonh implements aoni {
    public static final auap a;
    private static volatile aopf i;
    public int b;
    public aqyg d;
    public int e;
    public arfs f;
    public apxf g;
    public apxf h;
    private aqyg j;
    private auda k;
    private aota m;
    private byte n = 2;
    public String c = "";

    static {
        auap auapVar = new auap();
        a = auapVar;
        aonm.registerDefaultInstance(auap.class, auapVar);
    }

    private auap() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0007\u0001ဈ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ဌ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0007\bᐉ\b\tᐉ\u0006\nᐉ\t", new Object[]{"b", "c", "d", "j", "e", atxj.k, "f", "g", "h", "k", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new auap();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (auap.class) {
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
