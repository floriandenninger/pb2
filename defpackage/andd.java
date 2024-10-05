package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class andd extends aonm implements aooz {
    private static final andd a;
    private static volatile aopf b;
    private int c;
    private aony d = emptyProtobufList();
    private String e = "";
    private ancu f;

    static {
        andd anddVar = new andd();
        a = anddVar;
        aonm.registerDefaultInstance(andd.class, anddVar);
    }

    private andd() {
    }

    public static ancs a() {
        return (ancs) a.createBuilder();
    }

    public static andd c(byte[] bArr) {
        return (andd) aonm.parseFrom(a, bArr);
    }

    public void e(ancu ancuVar) {
        ancuVar.getClass();
        this.f = ancuVar;
        this.c |= 16777216;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0019\u0019\u0001\u0000\u0000\u0000\u0019ဉ\u0018", new Object[]{"c", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new andd();
            case NEW_BUILDER:
                return new ancs();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (andd.class) {
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
