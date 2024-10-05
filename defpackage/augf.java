package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class augf extends aonm implements aooz {
    public static final augf a;
    private static volatile aopf k;
    public int b;
    public augy c;
    public auge d;
    public aoxy f;
    public boolean i;
    public boolean j;
    private aota l;
    private byte m = 2;
    public aony e = emptyProtobufList();
    public aomf g = aomf.b;
    public String h = "";

    static {
        augf augfVar = new augf();
        a = augfVar;
        aonm.registerDefaultInstance(augf.class, augfVar);
    }

    private augf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003\u001b\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ည\u0004\u0007ဈ\u0005\bဇ\u0006\tဇ\u0007", new Object[]{"b", "c", "d", "e", augv.class, "f", "l", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new augf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (augf.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
