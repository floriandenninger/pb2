package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apnk extends aonm implements aooz {
    private static final apnk a;
    private static volatile aopf b;
    private int c;
    private int d;

    static {
        apnk apnkVar = new apnk();
        a = apnkVar;
        aonm.registerDefaultInstance(apnk.class, apnkVar);
    }

    private apnk() {
    }

    public static apnj a() {
        return (apnj) a.createBuilder();
    }

    public static apnk c() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(aver averVar) {
        this.d = averVar.c;
        this.c |= 1;
    }

    public aver d() {
        aver b2 = aver.b(this.d);
        return b2 == null ? aver.SCREEN_UNKNOWN : b2;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "d", aver.a()});
            case NEW_MUTABLE_INSTANCE:
                return new apnk();
            case NEW_BUILDER:
                return new apnj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apnk.class) {
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
