package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqod extends aonm implements aooz {
    public static final aqod a;
    public static final aonk b;
    private static volatile aopf h;
    public int c;
    private awqj i;
    private awqj j;
    private byte k = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        aqod aqodVar = new aqod();
        a = aqodVar;
        aonm.registerDefaultInstance(aqod.class, aqodVar);
        b = aonm.newSingularGeneratedExtension(awog.a, aqodVar, aqodVar, null, 373468381, aoqn.MESSAGE, aqod.class);
    }

    private aqod() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\b\u0006\u0000\u0000\u0002\u0003ဈ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ဈ\u0006\u0007ဈ\u0007\bဈ\b", new Object[]{"c", "d", "i", "j", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqod();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqod.class) {
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
