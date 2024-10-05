package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avkf extends aonm implements aooz {
    public static final avkf a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private apxf f;
    private avkh g;
    private avkg h;
    private aqyg i;
    private aota j;
    private byte k = 2;

    static {
        avkf avkfVar = new avkf();
        a = avkfVar;
        aonm.registerDefaultInstance(avkf.class, avkfVar);
    }

    private avkf() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\f\u0007\u0000\u0000\u0007\u0002ᐉ\u0001\u0005ᐉ\u0006\u0006ᐉ\b\u0007ᐉ\u0005\nᐉ\u000b\u000bᐉ\u0007\fᐉ\f", new Object[]{"c", "d", "f", "h", "e", "i", "g", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new avkf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avkf.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
