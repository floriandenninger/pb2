package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arku extends aonm implements aooz {
    public static final arku a;
    private static volatile aopf h;
    public int b;
    public arnd c;
    public apxf d;
    public aovp e;
    public arkt f;
    private aqzg i;
    private byte j = 2;
    public aony g = emptyProtobufList();

    static {
        arku arkuVar = new arku();
        a = arkuVar;
        aonm.registerDefaultInstance(arku.class, arkuVar);
    }

    private arku() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006Л̉ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", apxf.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new arku();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arku.class) {
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
