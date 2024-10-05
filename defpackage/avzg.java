package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avzg extends aonm implements aooz {
    public static final avzg a;
    public static final aonk b;
    private static volatile aopf g;
    public int c;
    public String d = "";
    public String e = "";
    public long f;

    static {
        avzg avzgVar = new avzg();
        a = avzgVar;
        aonm.registerDefaultInstance(avzg.class, avzgVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, avzgVar, avzgVar, null, 76, aoqn.MESSAGE, avzg.class);
    }

    private avzg() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new avzg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (avzg.class) {
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
