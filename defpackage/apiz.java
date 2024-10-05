package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apiz extends aonm implements aooz {
    public static final apiz a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        apiz apizVar = new apiz();
        a = apizVar;
        aonm.registerDefaultInstance(apiz.class, apizVar);
    }

    private apiz() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\uee5d⇧\ue494炉\u0002\u0000\u0000\u0002\uee5d⇧ᐼ\u0000\ue494炉ᐼ\u0000", new Object[]{"c", "b", aqph.class, auep.class});
            case NEW_MUTABLE_INSTANCE:
                return new apiz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (apiz.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
