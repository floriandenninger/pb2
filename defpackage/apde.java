package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apde extends aonm implements aooz {
    public static final apde a;
    private static volatile aopf g;
    public int b;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public aony f = emptyProtobufList();

    static {
        apde apdeVar = new apde();
        a = apdeVar;
        aonm.registerDefaultInstance(apde.class, apdeVar);
    }

    private apde() {
    }

    public static /* synthetic */ void a(apde apdeVar) {
        apdeVar.b |= 1;
        apdeVar.c = "com.google.android.youtube";
    }

    public static /* synthetic */ void b(apde apdeVar) {
        apdeVar.b |= 2;
        apdeVar.d = "android.intent.action.VIEW";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004Л", new Object[]{"b", "c", "d", "e", "f", askp.class});
            case NEW_MUTABLE_INSTANCE:
                return new apde();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (apde.class) {
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
