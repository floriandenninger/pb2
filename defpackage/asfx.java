package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asfx extends aonm implements aooz {
    public static final asfx a;
    private static volatile aopf j;
    public int b;
    public arnb c;
    public long e;
    public apmu g;
    public avit h;
    private asfr k;
    private byte l = 2;
    public String d = "";
    public String f = "";
    public String i = "";

    static {
        asfx asfxVar = new asfx();
        a = asfxVar;
        aonm.registerDefaultInstance(asfx.class, asfxVar);
    }

    private asfx() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဈ\u0007", new Object[]{"b", "c", "d", "e", "f", "k", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new asfx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (asfx.class) {
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
