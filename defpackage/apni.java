package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apni extends aonm implements aooz {
    private static final apni a;
    private static volatile aopf b;
    private int c = 0;
    private Object d;

    static {
        apni apniVar = new apni();
        a = apniVar;
        aonm.registerDefaultInstance(apni.class, apniVar);
    }

    private apni() {
    }

    public static apng a() {
        return (apng) a.createBuilder();
    }

    public static apni d() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(apnk apnkVar) {
        apnkVar.getClass();
        this.d = apnkVar;
        this.c = 1;
    }

    public apnh b() {
        return apnh.a(this.c);
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"d", "c", apnk.class});
            case NEW_MUTABLE_INSTANCE:
                return new apni();
            case NEW_BUILDER:
                return new apng();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apni.class) {
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

    public apnk e() {
        return this.c == 1 ? (apnk) this.d : apnk.c();
    }
}
