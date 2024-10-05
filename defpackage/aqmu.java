package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqmu extends aonm implements aooz {
    public static final aqmu a;
    public static final aonk b;
    private static volatile aopf j;
    public int c;
    public int f;
    public int i;
    public String d = "";
    public String e = "";
    public String g = "";
    public String h = "";

    static {
        aqmu aqmuVar = new aqmu();
        a = aqmuVar;
        aonm.registerDefaultInstance(aqmu.class, aqmuVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, aqmuVar, aqmuVar, null, 224, aoqn.MESSAGE, aqmu.class);
    }

    private aqmu() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006င\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aqmu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aqmu.class) {
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
