package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avda extends aonm implements aooz {
    public static final avda a;
    private static volatile aopf h;
    public int b;
    public float c;
    public float d;
    public int e;
    public float f;
    public float g;

    static {
        avda avdaVar = new avda();
        a = avdaVar;
        aonm.registerDefaultInstance(avda.class, avdaVar);
    }

    private avda() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဌ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"b", "c", "d", "e", avcl.e, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new avda();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (avda.class) {
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
