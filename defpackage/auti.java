package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auti extends aonm implements aooz {
    public static final auti a;
    private static volatile aopf j;
    public int b;
    public avgg d;
    public auth f;
    public apxf h;
    private byte k = 2;
    public String c = "";
    public String e = "";
    public String g = "";
    public boolean i = true;

    static {
        auti autiVar = new auti();
        a = autiVar;
        aonm.registerDefaultInstance(auti.class, autiVar);
    }

    private auti() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0005ဉ\u0004\u0006ဈ\u0005\u0007ᐉ\u0006\bဇ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new auti();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (auti.class) {
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
