package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arrt extends aonm implements aooz {
    public static final arrt a;
    private static volatile aopf i;
    public int b;
    public arnd c;
    public aulq d;
    public aulq e;
    public aulq f;
    public int g;
    public int h;
    private aulp j;
    private aota k;
    private byte l = 2;

    static {
        arrt arrtVar = new arrt();
        a = arrtVar;
        aonm.registerDefaultInstance(arrt.class, arrtVar);
    }

    private arrt() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0006\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0007ᐉ\b\bᐉ\u0004\tဋ\u0005\nဋ\u0006", new Object[]{"b", "c", "d", "e", "f", "k", "j", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arrt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (arrt.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
