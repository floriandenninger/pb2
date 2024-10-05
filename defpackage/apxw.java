package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apxw extends aonm implements aooz {
    public static final apxw a;
    public static final aonk b;
    private static volatile aopf k;
    public int c;
    public String d = "";
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    static {
        apxw apxwVar = new apxw();
        a = apxwVar;
        aonm.registerDefaultInstance(apxw.class, apxwVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, apxwVar, apxwVar, null, 215, aoqn.MESSAGE, apxw.class);
    }

    private apxw() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new apxw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (apxw.class) {
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
