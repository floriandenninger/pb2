package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aote extends aonm implements aooz {
    public static final aote a;
    private static volatile aopf g;
    public int b;
    public aulq d;
    public String e;
    public String f;
    private byte h = 2;
    public String c = "";

    static {
        aote aoteVar = new aote();
        a = aoteVar;
        aonm.registerDefaultInstance(aote.class, aoteVar);
    }

    private aote() {
        aonm.emptyProtobufList();
        this.e = "";
        this.f = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001\u0004ဈ\u0002\u0005ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aote();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aote.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
