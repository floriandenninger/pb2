package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqlz extends aonm implements aooz {
    public static final aqlz a;
    private static volatile aopf h;
    public int b;
    public String c = "";
    public aony d = emptyProtobufList();
    public aqll e;
    public boolean f;
    public int g;

    static {
        aqlz aqlzVar = new aqlz();
        a = aqlzVar;
        aonm.registerDefaultInstance(aqlz.class, aqlzVar);
    }

    private aqlz() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဇ\u0002\u0005ဌ\u0003", new Object[]{"b", "c", "d", aqll.class, "e", "f", "g", aqma.a()});
            case NEW_MUTABLE_INSTANCE:
                return new aqlz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqlz.class) {
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
