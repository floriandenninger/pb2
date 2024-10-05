package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bach extends aonm implements aooz {
    public static final bach a;
    private static volatile aopf k;
    public int b;
    public boolean c;
    public bacd d;
    public int g;
    public andu i;
    public aosj j;
    private byte l = 2;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        bach bachVar = new bach();
        a = bachVar;
        aonm.registerDefaultInstance(bach.class, bachVar);
    }

    private bach() {
    }

    public static /* synthetic */ void a(bach bachVar) {
        bachVar.b |= 1;
        bachVar.c = true;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0007ဈ\u0007\tᐉ\b\nဉ\t", new Object[]{"b", "c", "d", "e", "f", "g", babw.e, "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new bach();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (bach.class) {
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
