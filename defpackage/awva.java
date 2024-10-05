package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awva extends aonm implements aooz {
    public static final awva a;
    private static volatile aopf e;
    public int b;
    public aoot c = aoot.a;
    public long d;

    static {
        awva awvaVar = new awva();
        a = awvaVar;
        aonm.registerDefaultInstance(awva.class, awvaVar);
    }

    private awva() {
    }

    public final aoot a() {
        aoot aootVar = this.c;
        if (!aootVar.b) {
            this.c = aootVar.a();
        }
        return this.c;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002ဃ\u0000", new Object[]{"b", "c", awuz.a, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new awva();
            case NEW_BUILDER:
                return new aone((char[][][]) null, (char[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awva.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
