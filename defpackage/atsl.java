package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atsl extends aonm implements aooz {
    public static final atsl a;
    private static volatile aopf h;
    public int b;
    public String c = "";
    public atsj d;
    public atsm e;
    public aqif f;
    public atsi g;
    private int i;

    static {
        atsl atslVar = new atsl();
        a = atslVar;
        aonm.registerDefaultInstance(atsl.class, atslVar);
    }

    private atsl() {
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0002\u00012\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0014ဉ\u0011\u001bဉ\u00172ဉ)", new Object[]{"b", "i", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new atsl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (atsl.class) {
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
