package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aunk extends aonm implements aooz {
    public static final aunk a;
    private static volatile aopf h;
    public int b;
    public aunl c;
    public aunj d;
    public aqyg e;
    public aqyg f;
    private apxf i;
    private aota j;
    private byte k = 2;
    public aomf g = aomf.b;

    static {
        aunk aunkVar = new aunk();
        a = aunkVar;
        aonm.registerDefaultInstance(aunk.class, aunkVar);
    }

    private aunk() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006\bည\u0007", new Object[]{"b", "i", "c", "d", "e", "f", "j", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aunk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aunk.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
